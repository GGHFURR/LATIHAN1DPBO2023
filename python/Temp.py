class Temp:
    # deklarasi class yang berisi data mahasiswa

    # constructor
    def __init__(self, nim, name, prodi, fakultas):
        self.nim = nim
        self.name = name
        self.prodi = prodi
        self.fakultas = fakultas

    # getter NIM
    def getNim(self):
        return self.nim
    # setter NIM

    def setNim(self, nim):
        self.nim = nim
    # getter Name

    def getName(self):
        return self.name
    # setter Name

    def setName(self, name):
        self.name = name
    # getter Prodi

    def getprodi(self):
        return self.prodi
    # setter Prodi

    def setProdi(self, prodi):
        self.prodi = prodi
    # getter Fakultas

    def getfakultas(self):
        return self.fakultas
    # setter fakultas

    def setFakultas(self, fakultas):
        self.fakultas = fakultas
