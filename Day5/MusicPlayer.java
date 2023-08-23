import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface MusicPlayer{
    void play();
    void pause();
    void stop();
    void addSong(String song);
    void removeSong(String song);
}
class MyMusicPlayer implements MusicPlayer{
    boolean playing;
    List<String> musiclist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void play(){
        if(!musiclist.isEmpty()){
            System.out.println("Playing Song");
            playing =true;
        }
        else {
            System.out.println("PlayList is Empty");
        }
    }
    @Override
    public void pause(){
        if(playing){
            System.out.println("Paused");
            playing =true;
        }
        else {
            System.out.println("PlayList is Empty");
        }
    }
    @Override
    public void stop(){
        if(playing){
            System.out.println("Stopped");
            playing =false;
        }
        else {
            System.out.println("PlayList is Empty");
        }
    }
    public void addSong(String song){
        System.out.print("Enter the item to add: ");
        song = sc.next();
        musiclist.add(song);
    }
    public void removeSong(String song){
        System.out.print("Select the item to remove: ");
        System.out.println(musiclist.toString());
        song = sc.next();
        musiclist.remove(song);
        System.out.println("Song Removed Successfully"+song);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MusicPlayer MyMusicPlayer = new MyMusicPlayer();
        System.out.print("Enter number of song to be added ");
        int noOfSongs = sc.nextInt();
        for (int i = 1; i <= noOfSongs; i++) {
            MyMusicPlayer.addSong("");
        }
        MyMusicPlayer.play();
        MyMusicPlayer.pause();
        MyMusicPlayer.removeSong("");
        MyMusicPlayer.stop();
        sc.close();
    }
}
