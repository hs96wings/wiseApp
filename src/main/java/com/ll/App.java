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
            Rq rq = new Rq(cmd);

            switch (rq.getActionCode()) {
                case "종료":
                    systemControl.exit();
                    return;
                case "등록":
                    wiseSayingController.write();
                    break;
                case "목록":
                    wiseSayingController.list();
                    break;
                case "삭제":
                    wiseSayingController.remove(rq);
                    break;
                case "수정":
                    wiseSayingController.modify(rq);
                    break;
            }
        }
    }
}
