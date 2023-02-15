#include <iostream>
#include <vector>
#include "temp.cpp"

using namespace std;

void displayMenu() // fungsi displaying menu
{
    cout << "1. Input Data" << endl;
    cout << "2. Show Data" << endl;
    cout << "3. Delete Data" << endl;
    cout << "4. Edit Data" << endl;
    cout << "5. Exit" << endl;
}

int main()
{
    vector<Temp> list; // deklarasi list
    int tc = 0;        // variabel inputan menu

    while (tc != 5)
    {
        displayMenu(); // tampil menu
        cout << "Your Choice : ";
        cin >> tc; // masukan menu

        if (tc == 1) // apabila input
        {
            cout << "=MENU INPUT=" << endl;
            string nim, name, prodi, fakultas;
            // meminta masukan input dan tampung
            cout << "NIM : ";
            cin >> nim;
            cout << "Name : ";
            cin >> name;
            cout << "Prodi : ";
            cin >> prodi;
            cout << "Fakultas : ";
            cin >> fakultas;
            cout << endl;
            list.push_back(Temp(nim, name, prodi, fakultas)); // add to list data
        }
        else if (tc == 2) // apabila print data
        {
            cout << "================================================================" << endl;
            cout << "|   nim    |      Name      |     Prodi     |     fakultas     |" << endl;
            cout << "================================================================" << endl;
            for (Temp &obj : list)
            {
                cout << "|" << left << setw(10) << obj.getNim() << "|" << setw(16) << obj.getName()
                     << "|" << setw(15) << obj.getProdi() << "|" << setw(18) << obj.getFakultas() << "|" << endl;
            }
            cout << "================================================================" << endl;
            cout << endl;
        }
        else if (tc == 3) // apabila hapus data
        {
            string no;
            cout << "Input data NIM to be deleted : ";
            cin >> no;                                                 // meminta masukan nim yang akan di hapus data
            bool found = false;                                        // bolean untuk status terhapus
            for (auto iter = list.begin(); iter != list.end(); iter++) // menggunakan iterator untuk mengolah index list
            {
                if (iter->getNim() == no) // membandingkan masukan dengan data di list apakah ketemu
                {
                    list.erase(iter); // hapus isi list tersebut
                    found = true;     // jadikan status menjadi true
                    break;
                }
            }
            if (!found)
            {
                cout << "Data not found!" << endl; // apabila status tidak true maka tidak ada data
            }
            else
            {
                cout << "Data has been deleted!" << endl; // apabila true maka sukses hapus data
            }
        }
        else if (tc == 4) // apabila edit data
        {
            string no, inim, iname, iprodi, ifakultas;
            cout << "Input data NIM to be edited : ";
            cin >> no;          // meminta masukan nim yang akan di edit data
            bool found = false; // bolean untuk status teredit
            for (Temp &obj : list)
            {
                if (obj.getNim() == no)
                {
                    // meminta masukan data baru dan slangsung set variabel tsb
                    cout << "Input the new NIM : ";
                    cin >> inim;
                    obj.setName(inim);
                    cout << "Input the new Name : ";
                    cin >> iname;
                    obj.setName(iname);
                    cout << "Input the new Prodi : ";
                    cin >> iprodi;
                    obj.setProdi(iprodi);
                    cout << "Input the new Fakultas : ";
                    cin >> ifakultas;
                    obj.setFakultas(ifakultas);
                    found = true; // jadikan status menjadi true
                    break;
                }
            }
            if (!found) // apabila status tidak true maka tidak ada data
            {
                cout << "Data not found!" << endl;
            }
            else // apabila true maka sukses edit data data
            {
                cout << "Data has been edited!" << endl;
            }
        }
    }

    return 0;
}
