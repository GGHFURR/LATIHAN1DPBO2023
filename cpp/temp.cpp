#include <bits/stdc++.h>
#include <iostream>
#include <string>

using namespace std;

class Temp // deklarasi class yang berisi data mahasiswa
{
private:
    string nim, name, prodi, fakultas;

public:
    Temp() // constructor
    {
        this->nim = "";
        this->name = "";
        this->prodi = "";
        this->fakultas = "";
    }
    Temp(string nim, string name, string prodi, string fakultas) // constructor
    {
        this->nim = nim;
        this->name = name;
        this->prodi = prodi;
        this->fakultas = fakultas;
    }
    // getter Nim
    string getNim()
    {
        return nim;
    }
    // setter Nim
    void setNim(string nim)
    {
        this->nim = nim;
    }
    // getter nama
    string getName()
    {
        return name;
    }
    // setter nama
    void setName(string name)
    {
        this->name = name;
    }
    // getter prodi
    string getProdi()
    {
        return prodi;
    }
    // setter prodi
    void setProdi(string prodi)
    {
        this->prodi = prodi;
    }
    // getter fakultas
    string getFakultas()
    {
        return fakultas;
    }
    // setter fakultas
    void setFakultas(string fakultas)
    {
        this->fakultas = fakultas;
    }
    // destructor
    ~Temp()
    {
    }
};