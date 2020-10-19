package com.quizappication;

import javax.xml.namespace.QName;

public class Game {

    Question[] questions=new Question[5];
    Player player=new Player();
    public void initGame()
    {
        for(int i=0;i<3;i++)
        {
            questions[i]=new Question();
        }
        questions[0].question="What type of program commonly displays waveforms?";
        questions[0].option1="Spreadsheet";
        questions[0].option2="Disk utility";
        questions[0].option3="Audio production";
        questions[0].option4="Internet Security";
        questions[0].correctAnswer=3;

        questions[1].question="What component may have a RISC architecture?";
        questions[1].option1="SSD";
        questions[1].option2="HDD";
        questions[1].option3="RAM";
        questions[1].option4="CPU";
        questions[1].correctAnswer=4;

        questions[2].question="In what year was the Heartbleed security vulnerability discovered?";
        questions[2].option1="2014";
        questions[2].option2="2016";
        questions[2].option3="2018";
        questions[2].option4="2020";
        questions[2].correctAnswer=1;;
    }
    public void play()
    {
     player.getDetails();
     for(int i=0;i<3;i++)
     {
         boolean status=questions[i].askQuestion();
         if (status==true)
         {
             System.out.println("Playing well");
             player.score++;
         }
         else
         {
             System.out.println(" we can't help you");
         }
     }
        System.out.println(player.name+" Your Score is " +player.score);
    }
}
