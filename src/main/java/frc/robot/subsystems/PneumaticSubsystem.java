// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public DoubleSolenoid leftDouble, rightDouble;

  public PneumaticSubsystem() {
    leftDouble = new DoubleSolenoid(0, 1);
    rightDouble = new DoubleSolenoid(/* The PCM CAN ID */ 0, 2, 3);
  }

  public void firstGear(){
    leftDouble.set(DoubleSolenoid.Value.kReverse);
    rightDouble.set(DoubleSolenoid.Value.kForward);
  }

  public void secondGear(){
    leftDouble.set(DoubleSolenoid.Value.kForward);
    rightDouble.set(DoubleSolenoid.Value.kReverse);
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
