// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.DrivetrainCommand;
import frc.robot.commands.GearOne;
import frc.robot.commands.GearTwo;
import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.subsystems.Pneumatics;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  XboxController xbox = new XboxController(0);
  private final Pneumatics pneumatics;
  private final DrivetrainSubsystem m_DrivetrainsSubsystem = new DrivetrainSubsystem();
  private final DrivetrainCommand m_autoCommand = new DrivetrainCommand(m_DrivetrainsSubsystem, xbox);
  //private final secondGearCommand m_secondGear = new secondGearCommand(m_PneumaticSubsystem, xbox);

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    pneumatics = new Pneumatics();
    // Configure the button bindings
    m_DrivetrainsSubsystem.setDefaultCommand(new DrivetrainCommand(m_DrivetrainsSubsystem, xbox));
    //m_PneumaticSubsystem.firstGear();
    configureButtonBindings();

  }

  /**
   * Use this method to define your button->command mappings. Buttons can be
   * created by instantiating a {@link GenericHID} or one of its subclasses
   * ({@link edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then
   * passing it to a {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    JoystickButton buttonY = new JoystickButton(xbox, XboxController.Button.kY.value);
    JoystickButton buttonA = new JoystickButton(xbox, XboxController.Button.kA.value);

    buttonY.whenPressed(new GearOne(pneumatics, xbox));
    buttonA.whenPressed(new GearTwo(pneumatics, xbox));


    //buttonY.toggleWhenPressed(new firstGearCommand(m_PneumaticSubsystem));
   // JoystickButton buttonA = new JoystickButton(xbox, XboxController.Button.kA.value);
    //buttonA.whenPressed(new secondGearCommand(m_PneumaticSubsystem, xbox));

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
