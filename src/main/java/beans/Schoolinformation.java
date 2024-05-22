package beans;


import org.springframework.stereotype.Component;

@Component
public class Schoolinformation {
        private String fullname = "FPT Polytechnic";
        private String location = "TP.HCM";

        public Schoolinformation(){
        }

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }
}
