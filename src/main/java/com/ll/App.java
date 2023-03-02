package com.ll;

import com.ll.system.controller.SystemControl;
import com.ll.wiseSaying.controller.WiseSayingController;
import com.ll.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public void run() {
        System.out.println("=== 명언 앱 ===");

        SystemControl systemControl = new SystemControl();
        WiseSayingController wiseSayingController = new WiseSayingController();


        while (true) {
            System.out.print("명령) ");
            String cmd = Container.getScanner().nextLine().trim();

            if (cmd.equals("종료")) {
                SystemControl.exit();
                break;
            } else if (cmd.equals("등록")) {
                wiseSayingController.write();
            } else if (cmd.equals("목록")) {
                wiseSayingController.list();
            }
        }
    }
}
