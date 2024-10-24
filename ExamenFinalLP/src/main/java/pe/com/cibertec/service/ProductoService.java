package pe.com.cibertec.service;

import java.util.List;

import pe.com.cibertec.model.entity.ProductoEntity;

public interface ProductoService {
    List<ProductoEntity> buscarTodosProductos();
    ProductoEntity buscarProductoPorId(Integer id_producto);
    void crearProducto(ProductoEntity productoEntity);
    ProductoEntity actualizarProducto(Integer id_producto, ProductoEntity productoEntity);
    void eliminarProducto(Integer id_producto);
}