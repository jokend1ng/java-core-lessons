package com.company.project.lesson23.chainresponsobility;

public abstract class Action {
    private Action nextAction;

     public void nextAction(Action action) {
        if (nextAction != null){
            this.nextAction = action;
        }
    }
    public void executeNext(){
         this.execute();
         if(this.nextAction != null){
             this.nextAction.executeNext();
         }
    }

   protected abstract void execute();



}
