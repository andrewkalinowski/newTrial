/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.view;

/**
 *
 * @author gee
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name: ";
        //display the banner when view is created
        this.displayBanner();
        
    }

    private void displayBanner() {
       System.out.println {
        "\n* DragonKnight*"
         "\n*                                     *" 
        "\n*This is the game of DragonKnight,*"
       "\n*you wake up in the midst of Dragon and you don't know what to do *"
       "\n*************************************"
       );      
      
    }
    }
}
