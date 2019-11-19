import javax.swing.*;
import java.awt.*;
public class JAppletLifeCycle extends JApplet {
	public void init() {
		System.out.println("# init() : 초기화 루틴");
	}
	public void start() {
		System.out.println("# start() : 시작 루틴");
	}
	public void stop() {
		System.out.println("# stop() : 정지 루틴");
	}
	public void destroy() {
		System.out.println("# destroy() : 소멸 루틴");
	}
	public void paint(Graphics g) {
		System.out.println("# paint() : 출력 루틴");
		g.drawString("애플릿 라이프 사이클", 20, 20);
	}
}
