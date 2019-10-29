package com.example.reclyclerview;

class keluarga {
    private String  nama, status;
    private Integer foto;

    public Integer getFoto(){
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public keluarga(String nama, String status, Integer foto){
        this.nama = nama;
        this.status = status;
        this.foto = foto;
    }

    public String getNama() {return nama;}

    public void setNama (String nama) { this.nama = nama;}

    public String getStatus() { return status;}

    public void setStatus (String status) {this.status = status;}
}
