// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class DrivetrainSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private DifferentialDrive m_myRobot;
  public DrivetrainSubsystem() {
    CANSparkMax m_myRobotLeftGroupEnd = new CANSparkMax(Constants.LEFT_END, MotorType.kBrushless);
    CANSparkMax m_myRobotLeftGroupMiddle = new CANSparkMax(Constants.LEFT_MIDDLE, MotorType.kBrushless);
    CANSparkMax m_myRobotLeftGroupFront = new CANSparkMax(Constants.LEFT_FRONT, MotorType.kBrushless);
    m_myRobotLeftGroupEnd.follow(m_myRobotLeftGroupFront);
    m_myRobotLeftGroupMiddle.follow(m_myRobotLeftGroupFront);
    CANSparkMax m_myRobotRightGroupEnd = new CANSparkMax(Constants.RIGHT_END, MotorType.kBrushless);
    CANSparkMax m_myRobotRightGroupMiddle = new CANSparkMax(Constants.RIGHT_MIDDLE, MotorType.kBrushless);
    CANSparkMax m_myRobotRightGroupFront = new CANSparkMax(Constants.RIGHT_END, MotorType.kBrushless);
    m_myRobotRightGroupMiddle.follow(m_myRobotRightGroupFront);
    m_myRobotRightGroupEnd.follow(m_myRobotRightGroupFront);

    // m_myRobot____ is not actually a group it defines the CANspark as seen above.
    // Change if needed.
    m_myRobot = new DifferentialDrive(m_myRobotLeftGroupFront, m_myRobotRightGroupFront);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

public void arcadeDrive(double asDouble, double asDouble2) {
  m_myRobot.arcadeDrive(asDouble, asDouble2, true);
}

}
