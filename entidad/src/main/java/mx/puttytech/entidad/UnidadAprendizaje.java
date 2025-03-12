/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.puttytech.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gusba
 */
@Entity
@Table(name = "unidad_aprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadAprendizaje.findAll", query = "SELECT u FROM UnidadAprendizaje u")
    , @NamedQuery(name = "UnidadAprendizaje.findByClaveUnidadAprendizaje", query = "SELECT u FROM UnidadAprendizaje u WHERE u.claveUnidadAprendizaje = :claveUnidadAprendizaje")
    , @NamedQuery(name = "UnidadAprendizaje.findByNombreunidad", query = "SELECT u FROM UnidadAprendizaje u WHERE u.nombreunidad = :nombreunidad")
    , @NamedQuery(name = "UnidadAprendizaje.findByHorasClase", query = "SELECT u FROM UnidadAprendizaje u WHERE u.horasClase = :horasClase")
    , @NamedQuery(name = "UnidadAprendizaje.findByHorasTaller", query = "SELECT u FROM UnidadAprendizaje u WHERE u.horasTaller = :horasTaller")
    , @NamedQuery(name = "UnidadAprendizaje.findByHorasLaboratorio", query = "SELECT u FROM UnidadAprendizaje u WHERE u.horasLaboratorio = :horasLaboratorio")})
public class UnidadAprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "claveUnidadAprendizaje")
    private Integer claveUnidadAprendizaje;
    @Basic(optional = false)
    @Column(name = "nombreunidad")
    private String nombreunidad;
    @Basic(optional = false)
    @Column(name = "horasClase")
    private int horasClase;
    @Basic(optional = false)
    @Column(name = "horasTaller")
    private int horasTaller;
    @Basic(optional = false)
    @Column(name = "horasLaboratorio")
    private int horasLaboratorio;
    @OneToMany(mappedBy = "claveUnidadAprendizaje")
    private List<Asignacion> asignacionList;

    public UnidadAprendizaje() {
    }

    public UnidadAprendizaje(Integer claveUnidadAprendizaje) {
        this.claveUnidadAprendizaje = claveUnidadAprendizaje;
    }

    public UnidadAprendizaje(Integer claveUnidadAprendizaje, String nombreunidad, int horasClase, int horasTaller, int horasLaboratorio) {
        this.claveUnidadAprendizaje = claveUnidadAprendizaje;
        this.nombreunidad = nombreunidad;
        this.horasClase = horasClase;
        this.horasTaller = horasTaller;
        this.horasLaboratorio = horasLaboratorio;
    }

    public Integer getClaveUnidadAprendizaje() {
        return claveUnidadAprendizaje;
    }

    public void setClaveUnidadAprendizaje(Integer claveUnidadAprendizaje) {
        this.claveUnidadAprendizaje = claveUnidadAprendizaje;
    }

    public String getNombreunidad() {
        return nombreunidad;
    }

    public void setNombreunidad(String nombreunidad) {
        this.nombreunidad = nombreunidad;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public int getHorasTaller() {
        return horasTaller;
    }

    public void setHorasTaller(int horasTaller) {
        this.horasTaller = horasTaller;
    }

    public int getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(int horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    @XmlTransient
    public List<Asignacion> getAsignacionList() {
        return asignacionList;
    }

    public void setAsignacionList(List<Asignacion> asignacionList) {
        this.asignacionList = asignacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (claveUnidadAprendizaje != null ? claveUnidadAprendizaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadAprendizaje)) {
            return false;
        }
        UnidadAprendizaje other = (UnidadAprendizaje) object;
        if ((this.claveUnidadAprendizaje == null && other.claveUnidadAprendizaje != null) || (this.claveUnidadAprendizaje != null && !this.claveUnidadAprendizaje.equals(other.claveUnidadAprendizaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.puttytech.entidad.UnidadAprendizaje[ claveUnidadAprendizaje=" + claveUnidadAprendizaje + " ]";
    }
    
}
