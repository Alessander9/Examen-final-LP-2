package pe.com.cibertec.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "tb_producto")
public class ProductoEntity {

	@Id
	@Column(name = "ID", nullable = false, length = 60)
	private Integer id_producto;
	
	@Column(name = "Nombre Producto", nullable = false, length = 60)
	private String nombreProducto;
	
	@Column(name = "Precio", nullable = false)
	private Double precio;
	
	@Column(name = "Stock", nullable = false)
	private Integer stock;
	
	@ManyToOne
	@JoinColumn(name = "FK_categoria", nullable = false)
	private CategoriaEntity categoriaEntity;

	
	
	
	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}


}
