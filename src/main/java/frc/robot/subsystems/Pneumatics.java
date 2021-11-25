// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pneumatics extends SubsystemBase {
  /** Creates a new Pneumatics. */
  private DoubleSolenoid leftDouble;
  private DoubleSolenoid rightDouble;
  
  public Pneumatics() {
    leftDouble = new DoubleSolenoid(0, 1);
    rightDouble = new DoubleSolenoid(/* The PCM CAN ID */ 0, 2, 3);

    leftDouble.set(DoubleSolenoid.Value.kReverse);
    rightDouble.set(DoubleSolenoid.Value.kForward);
  }

  public void gearOne(){
    leftDouble.set(DoubleSolenoid.Value.kForward);
    rightDouble.set(DoubleSolenoid.Value.kReverse);
  }

  public void gearTwo(){
    leftDouble.set(DoubleSolenoid.Value.kReverse);
    rightDouble.set(DoubleSolenoid.Value.kForward);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
