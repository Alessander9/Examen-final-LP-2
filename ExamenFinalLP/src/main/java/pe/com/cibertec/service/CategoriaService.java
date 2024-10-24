package pe.com.cibertec.service;

import java.util.List;
import pe.com.cibertec.model.entity.CategoriaEntity;

public interface CategoriaService {
    List<CategoriaEntity> listarCategoria();
    CategoriaEntity buscarCategoriaPorId(Integer categoria_id);
    CategoriaEntity crearCategoria(CategoriaEntity categoria);
    CategoriaEntity actualizarCategoria(CategoriaEntity categoria);
    void eliminarCategoria(Integer categoria_id);
}