//package com.example.eepeep;
//
//public class EepEep {
//    public static void main(String[] args) {
//        // Declare a MeepMeep instance
//        // With a field size of 800 pixels
//        MeepMeep meepMeep = new MeepMeep(800);
//
//        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
//                // Required: Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
//                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
//                // Option: Set theme. Default = ColorSchemeRedDark()
//                .setColorScheme(new ColorSchemeRedDark())
//                .followTrajectorySequence(drive ->
//                        drive.trajectorySequenceBuilder(new Pose2d(0, 0, 0))
//                                .forward(30)
//                                .turn(Math.toRadians(90))
//                                .forward(30)
//                                .addDisplacementMarker(() -> {
//                                    /* Everything in the marker callback should be commented out */
//
//                                    // bot.shooter.shoot()
//                                    // bot.wobbleArm.lower()
//                                })
//                                .turn(Math.toRadians(90))
//                                .splineTo(new Vector2d(10, 15), 0)
//                                .turn(Math.toRadians(90))
//                                .build()
//                );
//
//        // Set field image
//        meepMeep.setBackground(MeepMeep.Background.FIELD_FREIGHTFRENZY_ADI_DARK)
//                .setDarkMode(true)
//                // Background opacity from 0-1
//                .setBackgroundAlpha(0.95f)
//                .addEntity(myBot)
//                .start();
//    }
//}
