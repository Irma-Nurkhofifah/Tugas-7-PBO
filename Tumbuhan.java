/* 	Nama 	: Irma Nurkhofifah M.
	Nim 	: 13020180096
	waktu	: 20 april 2020
	tugas 7
*/

//nomor 3
//Program abstract class
public class Tumbuhan extends MakhlukHidup {
    private String Akar;
    public Tumbuhan (String Akar){
        this.Akar = Akar;
    }
    public void berdiri (){
        System.out.println("Tumbuhan berdiri dengan     :  "+Akar);
    }
}
