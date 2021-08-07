package competition.subsystems.drive.commands;

import javax.management.OperationsException;

import com.google.inject.Inject;

import xbot.common.command.BaseCommand;
import competition.operator_interface.OperatorInterface;
import competition.subsystems.drive.DriveSubsystem;
import edu.wpi.first.wpilibj.Joystick;

public class ArcadeDriveWithJoysticksCommand extends BaseCommand {

    DriveSubsystem drive;
    OperatorInterface joysticks;

    @Inject
    public ArcadeDriveWithJoysticksCommand(DriveSubsystem driveSubsystem, OperatorInterface oi) {
        drive = driveSubsystem;
        joysticks = oi;
    
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        double leftPower = joysticks.gamepad.getLeftStickY();
        double rightPower = joysticks.gamepad.getRightStickY();

    }

}
