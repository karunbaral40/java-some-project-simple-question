//- Create an interface Playable with methods play() and pause().
//        - Implement it in two classes: Song and Video.
//- Write a program that uses an array of Playable objects and calls their methods without knowing the exact type.
interface AnyPlayable{
    void play();
    void pause();
}
abstract class Length{
    abstract  void forward();
    abstract  void backward();

        }
        class video extends Length  implements AnyPlayable {
            @Override
            public void play() {
                System.out.println("playing the video...");
            }

            @Override
            public void pause() {
                System.out.println("video stop");
            }
            @Override
            void forward(){
                System.out.println(" video forward + 10 ");
            }
            @Override
            void backward(){
                System.out.println(" video backward - 10 ");
            }
        }
        class Audio implements AnyPlayable {
            @Override
            public void play() {
                System.out.println("playing the audio...");
            }

            @Override
            public void pause() {
                System.out.println("audio stop");
            }

        }


public class Playable {
    public static void main(String[] args) {
        AnyPlayable [] payable={new Audio(), new video()};
        for(AnyPlayable p :payable){
            p.play();
            p.pause();
        }

        video A= new video();
        A.forward();
        A.backward();


        AnyPlayable P=new video() ;
        P.play();




    }
}
