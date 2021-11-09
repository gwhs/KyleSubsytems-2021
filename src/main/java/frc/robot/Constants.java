// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.DoubleSolenoid;
//import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.XboxController;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;
/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    private final XboxController m_driverController = new XboxController(0);
    private static final int m_myRobotLeftEnd = 6;
    private static final int m_myRobotLeftMiddle = 5;
    private static final int m_myRobotLeftFront = 4;
    private static final int m_myRobotRightEnd = 3;
    private static final int m_myRobotRightMiddle = 2;
    private static final int m_myRobotRightFront = 1;
    private static Compressor compressor;
    private DoubleSolenoid leftDouble = new DoubleSolenoid(0, 1);
    private DoubleSolenoid rightDouble = new DoubleSolenoid(/* The PCM CAN ID */ 0, 2, 3); 
}
