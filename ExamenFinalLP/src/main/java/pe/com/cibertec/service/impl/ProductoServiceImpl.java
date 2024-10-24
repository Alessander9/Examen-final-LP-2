package pe.com.cibertec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.cibertec.model.entity.ProductoEntity;
import pe.com.cibertec.repository.ProductoRepository;
import pe.com.cibertec.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	
	
	@Override
	public List<ProductoEntity> buscarTodosProductos() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	

	@Override
	public void crearProducto(ProductoEntity productoEntity) {
		// TODO Auto-generated method stub
		
			productoRepository.save(productoEntity);
	}

	@Override
	public ProductoEntity actualizarProducto(Integer id_producto, ProductoEntity productoEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarProducto(Integer id_producto) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public ProductoEntity buscarProductoPorId(Integer id_producto) {
		// TODO Auto-generated method stub
		return null;
	}

}
