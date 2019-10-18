package person.pratice.patterns.command.remote;

import person.pratice.patterns.command.party.Command;
import person.pratice.patterns.command.party.NoCommand;

/**
 * @description: 遥控器
 * @author: 何祥敏
 * @create: 2019-10-13
 */
public class RemoteControl {
    private Command[] commands;

    public RemoteControl(){
        commands = new Command[4];

        for (int i = 0; i < 4; i ++){
            commands[i] = new NoCommand();
        }
    }

    public void setCommand(int number, Command command){
        commands[number] = command;
    }

    public void inButtonPressed(int number){
        commands[number].execute();
    }
}
