package ro.ase.cts.Decorator.R;

import java.security.PublicKey;

public class TestDecorator {
    public static void main(String[] args){
        AbstractVisualControl buttonLogin = new Button("Login", 1);
        AbstractVisualControl buttonDate = new Button("Date", 2);

        buttonLogin.click();
        buttonDate.click();

        System.out.println("-------------------------------");

        //Button with animation accesing the decorator
        AbstractVisualControl buttonAnimatieL = new DecoratorButtonAnimation(buttonLogin);
         buttonAnimatieL.click();

        //Button with Sound
        AbstractVisualControl buttonSoundD = new DecoratorButtonAnimation(buttonDate);

        //Button Login cu sunet
        AbstractVisualControl buttonLoginnS = new DecoratorButtonSound(buttonLogin, "Click.wav");
        //Button with animation and sound
        AbstractVisualControl buttonAnS = new DecoratorButtonSound(buttonAnimatieL, "Click2.wav");
        buttonAnS.click();




    }
}
