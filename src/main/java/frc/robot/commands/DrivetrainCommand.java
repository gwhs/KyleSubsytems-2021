// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DrivetrainSubsystem;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

/** An example command that uses an example subsystem. */
public class DrivetrainCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private DrivetrainSubsystem m_subsystem;
  private XboxController m_xbox;


  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   * @return
   */
  public DrivetrainCommand(DrivetrainSubsystem subsystem, XboxController xbox) {
    m_subsystem = subsystem;
    m_xbox = xbox;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

public DrivetrainCommand(DrivetrainSubsystem m_DrivetrainsSubsystem) {
}

// Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_subsystem.arcadeDrive(forwardSpeed(),turnSpeed());
  }
// This controls speed of motors
  private double forwardSpeed(){
    return m_xbox.getY(Hand.kLeft)*0.25;
  }
  private double turnSpeed(){
    return m_xbox.getX(Hand.kRight)*.35;
  }
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
