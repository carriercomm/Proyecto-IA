package ddosattack.relogo

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import net.sf.cglib.proxy.MethodProxy.CreateInfo;
import repast.simphony.relogo.Plural;
import repast.simphony.relogo.Stop;
import repast.simphony.relogo.Utility;
import repast.simphony.relogo.UtilityG;
import repast.simphony.relogo.schedule.Go;
import repast.simphony.relogo.schedule.Setup;
import ddosattack.ReLogoTurtle;

class ZombieHost extends ReLogoTurtle {
	def received = 0
	def sent = 0
	
	def step(){
		def winner = maxOneOf(neighbors()) {
			count(hostsOn(it))
		}
		
		face(winner)
		label = "Received: " + received + "\nSent: " + sent
		
		if(count(hostsHere())>0){
			def infectee = infect(oneOf(hostsHere()))
			infect(infectee)
		}
	}
	
	def infect(host){
		host.sleep(1000)
		host.received *= 10
	}
}
