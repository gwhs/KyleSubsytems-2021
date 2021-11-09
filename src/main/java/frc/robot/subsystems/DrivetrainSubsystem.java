// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.subsystems;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class DrivetrainSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public DrivetrainSubsystem() {
    m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
    m_chooser.addOption("My Auto", kCustomAuto);
    SmartDashboard.putData("Auto choices", m_chooser);
    CANSparkMax m_myRobotLeftGroupEnd = new CANSparkMax(m_myRobotLeftEnd, MotorType.kBrushless);
    CANSparkMax m_myRobotLeftGroupMiddle = new CANSparkMax(m_myRobotLeftMiddle, MotorType.kBrushless);
    CANSparkMax m_myRobotLeftGroupFront = new CANSparkMax(m_myRobotLeftFront, MotorType.kBrushless);
    SpeedControllerGroup m_leftGroup = new SpeedControllerGroup(m_myRobotLeftGroupEnd, m_myRobotLeftGroupMiddle,
        m_myRobotLeftGroupFront);
    CANSparkMax m_myRobotRightGroupEnd = new CANSparkMax(m_myRobotRightEnd, MotorType.kBrushless);
    CANSparkMax m_myRobotRightGroupMiddle = new CANSparkMax(m_myRobotRightMiddle, MotorType.kBrushless);
    CANSparkMax m_myRobotRightGroupFront = new CANSparkMax(m_myRobotRightFront, MotorType.kBrushless);
    SpeedControllerGroup m_RightGroup = new SpeedControllerGroup(m_myRobotRightGroupEnd, m_myRobotRightGroupMiddle,
        m_myRobotRightGroupFront);
    // m_myRobot____ is not actually a group it defines the CANspark as seen above.
    // Change if needed.
    m_myRobot = new DifferentialDrive(m_leftGroup, m_RightGroup);
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
