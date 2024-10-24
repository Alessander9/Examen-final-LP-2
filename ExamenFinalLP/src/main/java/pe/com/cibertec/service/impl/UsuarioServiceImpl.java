package pe.com.cibertec.service.impl;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import org.springframework.web.multipart.MultipartFile;

import pe.com.cibertec.model.entity.UsuarioEntity;
import pe.com.cibertec.repository.UsuarioRepository;
import pe.com.cibertec.service.UsuarioService;
import pe.com.cibertec.utils.Utilitarios;


@Service
@RequiredArgsConstructor

public class UsuarioServiceImpl implements UsuarioService {

	private final UsuarioRepository usuarioRepository;
	
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	

	@Override
	public void crearUsuario(UsuarioEntity usuarioEntity, MultipartFile foto) {
		//1. Guardar la foto
		String nombreFoto = Utilitarios.guardarImagen(foto);
		usuarioEntity.setUrlImagen(nombreFoto);
		
		//2. Extraer el hash del password
		String passwordHash = Utilitarios.extraerHash(usuarioEntity.getPassword());
		usuarioEntity.setPassword(passwordHash);
		
		//3. guardar en la base de datos
		usuarioRepository.save(usuarioEntity);
		
	}
	
	@Override
	public boolean validarUsuario(UsuarioEntity usuarioFormulario) {
		//1. Buscar correo en base de datos
			UsuarioEntity usuarioEncontrado = usuarioRepository
					.findByCorreo(usuarioFormulario.getCorreo());
		
		// 2. Correo existe
			if(usuarioEncontrado == null) {
				return false;
			}
		// 3. Validar si el password del formulario hace match con el hash de la base de datos
			if(!Utilitarios.checkPassword(usuarioFormulario.getPassword(),
					usuarioEncontrado.getPassword())) {
				return false;
			}

		return true;
	}

	@Override
	public UsuarioEntity buscarUsuarioPorCorreo(String correo) {
		// TODO Auto-generated method stub
		return usuarioRepository.findByCorreo(correo);
	}
}