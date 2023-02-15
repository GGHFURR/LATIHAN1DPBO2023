from Temp import Temp

# fungsi tampil menu


def displayMenu():
    print("1. Input Data")
    print("2. Show Data")
    print("3. Delete Data")
    print("4. Edit Data")
    print("5. Exit")

# fugnsi main menu


def main():
    list = []   # deklar menu
    tc = 0  # deklar inputan

    while tc != 5:
        displayMenu()
        tc = int(input("Your Choice : "))   # masukkan inputan

        if tc == 1:  # apabila input
            print("=MENU INPUT=")
            nim = input("NIM : ")
            name = input("Name : ")
            prodi = input("Prodi : ")
            fakultas = input("Fakultas : ")
            print()
            # Masukkan inputan ke liist
            list.append(Temp(nim, name, prodi, fakultas))
        elif tc == 2:  # apabila show data
            print("================================================================")
            print("|   nim    |      Name      |     Prodi     |     fakultas     |")
            print("================================================================")
            for obj in list:
                print("|{:<10}|{:<16}|{:<15}|{:<18}|".format(
                    obj.getNim(), obj.getName(), obj.getprodi(), obj.getfakultas()))
            print("================================================================")
            print()
        elif tc == 3:  # apabila hapus data
            no = input("Input data NIM to be deleted : ")
            found = False
            for obj in list:    # looping kesemua isi list
                if obj.getNim() == no:  # apabila ketemu variabel yang ingin di hapus
                    list.remove(obj)  # hapus data dalam list
                    found = True  # jadikan status jadi true karna sukses hapus data
                    break
            if not found:
                # apabila status masih false maka tidak ada data yang di hapus
                print("Data not found!")
            else:  # sukses hapus data
                print("Data has been deleted!")
        elif tc == 4:  # apabila edit data
            no = input("Input data NIM to be edited : ")
            found = False
            for obj in list:    # looping kesemua isi list
                if obj.getNim() == no:  # apabila ketemu variabel yang ingin di hapus
                    # set kedata inputan baru
                    obj.setNim(input("Input the new NIM : "))
                    obj.setName(input("Input the new Name : "))
                    obj.setProdi(input("Input the new Prodi : "))
                    obj.setFakultas(input("Input the new Fakultas : "))
                    found = True
                    break
            if not found:
                # apabila status masih false maka tidak ada data yang di hapus
                print("Data not found!")
            else:
                # sukses hapus data
                print("Data has been edited!")


if __name__ == "__main__":
    main()
