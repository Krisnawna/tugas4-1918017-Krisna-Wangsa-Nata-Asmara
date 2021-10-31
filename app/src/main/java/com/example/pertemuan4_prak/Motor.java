package com.example.pertemuan4_prak;

public class Motor
{
        private String nama,jenis,cc;
        private int foto;
        public Motor(String nama, String jenis, String cc, int foto)
        {
            this.nama = nama;
            this.jenis = jenis;
            this.cc = cc;
            this.foto = foto;
        }

        public String getNama()
        {
            return nama;
        }
        public void setNama(String nama)
        {
            this.nama = nama;
        }
        public String getJenis(){ return jenis; }
        public void setJenis(String jenis){
            this.jenis = jenis;
        }
        public String getCc(){
            return cc;
        }
        public void setcc(String cc){
            this.cc = cc;
        }

        public int getFoto() { return foto; }
        public void setFoto(int foto) { this.foto = foto; }
}
