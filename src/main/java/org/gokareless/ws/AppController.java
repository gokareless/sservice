package org.gokareless.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping("/release")
    Release release() {
        return new Release("@sservice",  "1.0");
    }

    static class Release {
        String name;
        String version;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public Release(String name, String version) {
            this.name = name;
            this.version = version;
        }
    }
}
