/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author TOSHIBA
 */
@Entity
@Table(name = "buku", catalog = "pwpb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Buku.findAll", query = "SELECT b FROM Buku b")
    , @NamedQuery(name = "Buku.findByKode", query = "SELECT b FROM Buku b WHERE b.kode = :kode")
    , @NamedQuery(name = "Buku.findByJudul", query = "SELECT b FROM Buku b WHERE b.judul = :judul")
    , @NamedQuery(name = "Buku.findByTahun", query = "SELECT b FROM Buku b WHERE b.tahun = :tahun")
    , @NamedQuery(name = "Buku.findByPengarang", query = "SELECT b FROM Buku b WHERE b.pengarang = :pengarang")})
public class Buku implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode")
    private String kode;
    @Basic(optional = false)
    @Column(name = "judul")
    private String judul;
    @Basic(optional = false)
    @Column(name = "tahun")
    private String tahun;
    @Basic(optional = false)
    @Column(name = "pengarang")
    private String pengarang;

    public Buku() {
    }

    public Buku(String kode) {
        this.kode = kode;
    }

    public Buku(String kode, String judul, String tahun, String pengarang) {
        this.kode = kode;
        this.judul = judul;
        this.tahun = tahun;
        this.pengarang = pengarang;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        String oldKode = this.kode;
        this.kode = kode;
        changeSupport.firePropertyChange("kode", oldKode, kode);
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        String oldJudul = this.judul;
        this.judul = judul;
        changeSupport.firePropertyChange("judul", oldJudul, judul);
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        String oldTahun = this.tahun;
        this.tahun = tahun;
        changeSupport.firePropertyChange("tahun", oldTahun, tahun);
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        String oldPengarang = this.pengarang;
        this.pengarang = pengarang;
        changeSupport.firePropertyChange("pengarang", oldPengarang, pengarang);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kode != null ? kode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buku)) {
            return false;
        }
        Buku other = (Buku) object;
        if ((this.kode == null && other.kode != null) || (this.kode != null && !this.kode.equals(other.kode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "perpus.Buku[ kode=" + kode + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
