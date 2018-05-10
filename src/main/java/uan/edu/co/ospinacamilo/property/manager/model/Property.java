package uan.edu.co.ospinacamilo.property.manager.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * @author Camilo Ospina
 *
 */
@Entity
@Table(name = "Property")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Property implements Serializable{
	private static final long serialVersionUID = -2915524939360833764L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "rooms")
	private long rooms;

	@Column(name = "address")
	private String address;
	
	@Column(name = "id_ciudad")
	private long id_ciudad;
	
	@Column(name = "precio")
	private float precio;
	
	@Column(name = "tipoinmueble")
	private long tipoinmueble;
	
	@Column(name = "estrato")
	private long estrato;
	
	@Column(name = "area")
	private long area;
	
	@Column(name = "tieneacueducto")
	private boolean tieneacueducto;

	@Column(name = "tienealcantarillado")
	private boolean tienealcantarillado;
	
	@Column(name = "tienegas")
	private boolean tienegas;

	@Column(name = "tienealumbrado")
	private boolean tienealumbrado;
	
	@Column(name = "numerococinas")
	private long numerococinas;
	
	@Column(name = "garaje")
	private boolean garaje;
	
	@Column(name = "pisos")
	private long pisos;
	
	@Column(name = "precioadmon")
	private float precioadmon;
	
	@Column(name = "idinvestigador")
	private long idinvestigador;
	
	
	
	
	protected Property() {
	}

	public Property(long rooms, String address) {
		this.rooms = rooms;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getrooms() {
		return rooms;
	}

	public void setRooms(long rooms) {
		this.rooms = rooms;
	}
	
	public long getid_ciudad() {
	return id_ciudad;
	}
	
	public float getprecio() {
		return precio;
	}
	
	public long gettipoinmueble() {
		return tipoinmueble;
	}
	
	public long getestrato() {
		return estrato;
	}
	
	public long getarea() {
		return area;
	}
	
	public boolean gettieneacueducto() {
		return tieneacueducto;
	}

	public boolean gettienealcantarillado() {
		return tienealcantarillado;
	}
	
	public boolean gettienegas() {
		return tienegas;
	}

	public boolean gettienealumbrado() {
		return tienealumbrado;
	}
	
	public long getnumerococinas() {
		return numerococinas;
	}
	
	public boolean getgaraje() {
		return garaje;
	}
	
	public long getpisos() {
		return pisos;
	}
	
	public float getprecioadmon() {
		return precioadmon;
	}
	
	public long getidinvestigador() {
		return idinvestigador;
	}
	
	//set entities
	public void setid_ciudad(long id_ciudad) {
		this.id_ciudad = id_ciudad;
		}
		
		public void setprecio(float precio) {
			this.precio=precio;
		}
		
		public void settipoinmueble(long tipoinmueble) {
			this.tipoinmueble=tipoinmueble;
		}
		
		public void setestrato(long estrato) {
			this.estrato= estrato;
		}
		
		public void setarea(long area) {
			this.area=area;
		}
		
		public void settieneacueducto(boolean tieneacueducto) {
			this.tieneacueducto=tieneacueducto;
		}

		public void settienealcantarillado(boolean tienealcantarillado) {
			this.tienealcantarillado = tienealcantarillado;
		}
		
		public void settienegas(boolean tienegas) {
			this.tienegas = tienegas;
		}

		public void settienealumbrado(boolean tienealumbrado) {
			this.tienealumbrado=tienealumbrado;
		}
		
		public void setnumerococinas(long numerococinas) {
			this.numerococinas = numerococinas;
		}
		
		public void setgaraje(boolean garaje) {
			this.garaje =  garaje;
		}
		
		public void setpisos(long pisos) {
			this.pisos = pisos;
		}
		
		public void setprecioadmon(long precioadmon) {
			this.precioadmon = precioadmon;
		}
		
		public void setidinvestigador(long idinvestigador) {
			this.idinvestigador = idinvestigador;
		}
}
