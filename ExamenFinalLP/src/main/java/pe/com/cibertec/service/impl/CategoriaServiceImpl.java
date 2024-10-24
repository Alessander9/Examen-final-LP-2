package pe.com.cibertec.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cibertec.model.entity.CategoriaEntity;
import pe.com.cibertec.repository.CategoriaRepository;
import pe.com.cibertec.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaEntity> listarCategoria() {
        return categoriaRepository.findAll();
    }

    @Override
    public CategoriaEntity buscarCategoriaPorId(Integer id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public CategoriaEntity crearCategoria(CategoriaEntity categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public CategoriaEntity actualizarCategoria(CategoriaEntity categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void eliminarCategoria(Integer id) {
        categoriaRepository.deleteById(id);
    }
}
