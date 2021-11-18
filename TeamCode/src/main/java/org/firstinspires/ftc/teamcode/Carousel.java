package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Carousel {
    private Servo servo;
    private ElapsedTime timer;
    private CRServo motor;

    public Carousel(CRServo motor ) {
        this.motor = motor;
        motor.setDirection(DcMotorSimple.Direction.FORWARD);
    }
    public void on() {
        motor.setPower(1.0);
    }

    public void off() {
        motor.setPower(0.0);
    }

}
