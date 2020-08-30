package org.firstinspirees.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Prathik Iyengar", group = "Onboarding")
public class PrathikIyengar extends LinearOpMode {
{
    private DcMotor motorLeft;
    private DcMotor motorRight;

    private Servo armServo;

    private static final double ARM_RETRACTED_POSITION = 0.2;
    private static final double ARM_RETRACTED_POSITION = 0.8;

    @Override
    public void runOpMode() throws InterruptedException_ {
    {
        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight = hardwareMap.dcMotor.get("motorRight");

        motorLeft.setDirection(DcMotor.direction.REVERSE);

        armServo = hardwareMap.servo.get("armServo");

        armServo.setPosition(ARM_RETRACTED_POSITION);

        waitForStart();

        while(opModeIsActive())
        {
            motorLeft.setPower(-gamepad1.left_stick_y);
            motorRight.setPower(-gampad1.right_stick_y);

            if(gamepad2.a)
            {
                armServo.setPosition(ARM_RETRACTED_POSITION);
            }
            if(gamepad2.b)
            {
                armServo.setPosition(ARM_RETRACTED_POSITION)
            }

            idle();
        }
    }
}
