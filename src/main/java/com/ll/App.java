package com.ll;

import com.ll.system.controller.SystemControl;
import com.ll.wiseSaying.controller.WiseSayingController;
import com.ll.wiseSaying.entity.WiseSaying;

import java.util.*;

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
            } else if (cmd.startsWith("삭제")) {
                Rq rq = new Rq(cmd);
                System.out.printf("actionCode : %s\n", rq.getActionCode());
                System.out.printf("params.id : %s\n", rq.getParam("id"));

//                wiseSayingController.remove(cmd);
            }
        }
    }
}
