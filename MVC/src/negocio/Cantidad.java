package negocio;

public class Cantidad {
	
	private Double valor;
	private Integer unidad;
	
	public Cantidad (){}
	
	public Cantidad (Double val, Integer uni){
		
		this.setValor(val);
		this.setUnidad(uni);
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getUnidad() {
		return unidad;
	}

	public void setUnidad(Integer unidad) {
		this.unidad = unidad;
	}
	
	

}
