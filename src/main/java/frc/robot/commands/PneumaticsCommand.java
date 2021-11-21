// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.PneumaticsSubsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class PneumaticsCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  public final PneumaticsSubsystem m_subsystem;
  public XboxController m_xbox;
  public DoubleSolenoid m_leftDouble = new DoubleSolenoid(0, 1);
  public DoubleSolenoid m_rightDouble = new DoubleSolenoid(/* The PCM CAN ID */ 0, 2, 3);


    /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public PneumaticsCommand(PneumaticsSubsystem subsystem, XboxController xbox) {
    m_subsystem = subsystem;
    m_xbox = xbox;

    

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_xbox.getYButtonPressed()) {
        m_leftDouble.toggle();
        m_rightDouble.toggle();
  }
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
