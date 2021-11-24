// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class PneumaticsSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private DoubleSolenoid leftDouble = new DoubleSolenoid(0, 1);
  private DoubleSolenoid rightDouble = new DoubleSolenoid(/* The PCM CAN ID */ 0, 2, 3);
  XboxController xbox;

  public PneumaticsSubsystem() {
    leftDouble.set(DoubleSolenoid.Value.kReverse);
    rightDouble.set(DoubleSolenoid.Value.kForward);   
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    }
  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
