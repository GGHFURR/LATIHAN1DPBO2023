<?php

class Temp // deklarasi class yang berisi data mahasiswa
{
    private $nim;
    private $name;
    private $prodi;
    private $fakultas;
    private $foto;

    public function __construct($nim, $name, $prodi, $fakultas, $foto) // constructor
    {
        $this->nim = $nim;
        $this->name = $name;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
        $this->foto = $foto;
    }
    // getter foto
    public function getFoto()
    {
        return $this->foto;
    }
    // setter foto
    public function setFoto($foto)
    {
        $this->foto = $foto;
    }
    // getter Nim
    public function getNim()
    {
        return $this->nim;
    }
    // getter NIM
    public function getName()
    {
        return $this->name;
    }
    // getter prodi
    public function getProdi()
    {
        return $this->prodi;
    }
    // getter fakultas
    public function getFakultas()
    {
        return $this->fakultas;
    }
    // setter nama
    public function setName($name)
    {
        $this->name = $name;
    }
    // setter prodi
    public function setProdi($prodi)
    {
        $this->prodi = $prodi;
    }
    // setter fakultas
    public function setFakultas($fakultas)
    {
        $this->fakultas = $fakultas;
    }
}
