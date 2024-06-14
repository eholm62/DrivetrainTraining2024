// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Xbox;

public class TankDrive extends Command {
  public Drivetrain drivetrain;
  public Xbox controller;

  /** Creates a new TankDrive. */
  public TankDrive(Drivetrain drivetrain, Xbox controller) {
    this.drivetrain = drivetrain;
    this.controller = controller;
    addRequirements(drivetrain);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drivetrain.setPower(controller.getLeftStickY(), controller.getRightStickY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    for (int i = 0; i < 1000; i++) {
      System.out.println("Earth to Major Tom - David Bowie!");
    }
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
