import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Temp  //deklarasi class yang berisi data mahasiswa
{
    private String nim;
    private String name;
    private String prodi;
    private String fakultas;

    Temp()  //constructor
    {
        this.nim = "";
        this.name = "";
        this.prodi = "";
        this.fakultas = "";
    }
    Temp(String nim, String name, String prodi, String fakultas) //constructor
    {
        this.nim = nim;
        this.name = name;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }
    //getter Nim
    public String getNim()
    {
        return this.nim;
    }
    //setter Nim
    public void setNim(String nim)
    {
        this.nim = nim;
    }
    //getter nama
    public String getName()
    {
        return this.name;
    }
    //setter nama
    public void setName(String name)
    {
        this.name = name;
    }
    //getter prodi
    public String getprodi()
    {
        return this.prodi;
    }
    //setter prodi
    public void setProdi(String prodi)
    {
        this.prodi = prodi;
    }
    //getter fakultas
    public String getfakultas()
    {
        return this.fakultas;
    }
    //setter fakultas
    public void setFakultas(String fakultas)
    {
        this.fakultas = fakultas;
    }

}

class Main
{
    static void displayMenu()   //fungsi displaying menu
    {
        System.out.println("1. Input Data");
        System.out.println("2. Show Data");
        System.out.println("3. Delete Data");
        System.out.println("4. Edit Data");
        System.out.println("5. Exit");
    }

    //fungsi main
    public static void main(String [] args)
    {
        
        ArrayList<Temp> list = new ArrayList<>(); //deklarasi list
        Scanner sc = new Scanner(System.in);    //scanner string
        Scanner sc1 = new Scanner(System.in);   //scanner int
        int tc = 0; //variabel inputan menu

        do
        {
            displayMenu();  //tampil menu
            System.out.print("Your Choice : ");
            tc = sc1.nextInt(); //masukan menu

            if(tc == 1) //apabila input
            {   
                //meminta masukan input dan tampung
                System.out.print("=MENU INPUT=\n");
                System.out.print("NIM       : ");
                String nim = sc.next();
                System.out.print("Name      : ");
                String name = sc.next();
                System.out.print("Prodi     : ");
                String prodi = sc.next();
                System.out.print("Fakultas  : ");
                String fakultas = sc.next();
                System.out.println();

                list.add(new Temp(nim, name, prodi, fakultas)); //add to list data 
            }
            else if (tc == 2) //apabila print data
            {
                System.out.println("================================================================");
                System.out.println("|   nim    |      Name      |     Prodi     |     fakultas     |");
                System.out.println("================================================================");
                for (int i=0;i<list.size();i++) {
                    System.out.printf("|%-10s|%-16s|%-15s|%-18s|\n", list.get(i).getNim(), list.get(i).getName(), list.get(i).getprodi(),list.get(i).getfakultas());
                }
                System.out.println("================================================================");
                System.out.println();
            }
            else if (tc == 3) //apabila hapus data
            {
                boolean pp = false;                                  //bolean untuk status terhapus
                System.out.print("Input data NIM to be deleted : ");
                String no = sc.next();                                //meminta masukan nim yang akan di hapus data
                Iterator <Temp> i = list.iterator();                     //menggunakan iterator untuk mengolah index list
                while (i.hasNext()){                                    //lloping untuk mencari data yang akan di hapus
                    Temp temporary = i.next();                          //menyalin index list yang akan di hapus
                    if((temporary.getNim()).equals(no)){                //membandingkan masukan dengan data di list apakah ketemu
                        i.remove();                                     //hapus isi list tersebut
                        pp = true;                                      //jadikan status menjadi true 
                    }
                }

                if(!pp)                                                 //apabila status tidak true maka tidak ada data
                {
                    System.out.println("Data not found!");
                }
                else                                                    //apabila true maka sukses hapus data
                {
                    System.out.println("Data has been deleted!");
                }
            }
            else if (tc == 4)   //apabila edit data
            {
                boolean pp = false;                                     //bolean untuk status teredit
                System.out.print("Input data NIM to be edited : ");
                String no = sc.next();                                  //meminta masukan nim yang akan di edit data
                Iterator <Temp> i = list.iterator();                    //menggunakan iterator untuk mengolah index list
                while (i.hasNext()){                                     //lloping untuk mencari data yang akan di edit
                    Temp temporary = i.next();                          //menyalin index list yang akan di edit
                    if((temporary.getNim()).equals(no)){                //membandingkan masukan dengan data di list apakah ketemu

                        //meminta masukan data baru dan slangsung set variabel tsb
                        System.out.print("=MENU  EDIT=\n");
                        System.out.print("NIM       : ");
                        String nim = sc.next();
                        temporary.setNim(nim);
                        System.out.print("Name      : ");
                        String name = sc.next();
                        temporary.setName(name);
                        System.out.print("Prodi     : ");
                        String prodi = sc.next();
                        temporary.setProdi(prodi);
                        System.out.print("Fakultas  : ");
                        String fakultas = sc.next();
                        temporary.setFakultas(fakultas);
                        System.out.println();
                        pp = true;                                      //jadikan status menjadi true 
                    }
                }

                if(!pp)                                                 //apabila status tidak true maka tidak ada data
                {
                    System.out.println("Data not found!");
                }
                else                                                    //apabila true maka sukses edit data data
                {
                    System.out.println("Data has been edited!");
                }
            }
        }while (tc != 5);
        sc.close();     //close scanner
        sc1.close();
    }
}