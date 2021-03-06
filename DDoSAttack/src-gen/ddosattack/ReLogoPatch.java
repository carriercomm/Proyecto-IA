package ddosattack;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.ast.Diffusible;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;
import repast.simphony.space.SpatialException;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoPatch extends BasePatch{

	/**
	 * Sprouts (makes) a number of new zombieHosts and then executes a set of commands on the
	 * created zombieHosts.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created zombieHosts
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.ZombieHost")
	public AgentSet<ddosattack.relogo.ZombieHost> sproutZombieHosts(int number, Closure closure) {
		AgentSet<ddosattack.relogo.ZombieHost> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"ZombieHost");
		for (Turtle t : createResult){
			if (t instanceof ddosattack.relogo.ZombieHost){
				result.add((ddosattack.relogo.ZombieHost)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new zombieHosts and then executes a set of commands on the
	 * created zombieHosts.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created zombieHosts
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.ZombieHost")
	public AgentSet<ddosattack.relogo.ZombieHost> sproutZombieHosts(int number) {
		return sproutZombieHosts(number,null);
	}

	/**
	 * Returns an agentset of zombieHosts from the patch of the caller.
	 * 
	 * @return agentset of zombieHosts from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.ZombieHost")
	public AgentSet<ddosattack.relogo.ZombieHost> zombieHostsHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<ddosattack.relogo.ZombieHost> result = new AgentSet<ddosattack.relogo.ZombieHost>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"zombieHost")){
			if (t instanceof ddosattack.relogo.ZombieHost)
			result.add((ddosattack.relogo.ZombieHost)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of zombieHosts on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of zombieHosts at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.ZombieHost")
	public AgentSet<ddosattack.relogo.ZombieHost> zombieHostsAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
		AgentSet<ddosattack.relogo.ZombieHost> result = new AgentSet<ddosattack.relogo.ZombieHost>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"zombieHost")){
			if (t instanceof ddosattack.relogo.ZombieHost)
			result.add((ddosattack.relogo.ZombieHost)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<ddosattack.relogo.ZombieHost>();
		}
	}

	/**
	 * Returns an agentset of zombieHosts on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of zombieHosts on patch p
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.ZombieHost")
	public AgentSet<ddosattack.relogo.ZombieHost> zombieHostsOn(Patch p){
		AgentSet<ddosattack.relogo.ZombieHost> result = new AgentSet<ddosattack.relogo.ZombieHost>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"zombieHost")){
			if (t instanceof ddosattack.relogo.ZombieHost)
			result.add((ddosattack.relogo.ZombieHost)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of zombieHosts on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of zombieHosts on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.ZombieHost")
	public AgentSet<ddosattack.relogo.ZombieHost> zombieHostsOn(Turtle t){
		AgentSet<ddosattack.relogo.ZombieHost> result = new AgentSet<ddosattack.relogo.ZombieHost>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"zombieHost")){
			if (tt instanceof ddosattack.relogo.ZombieHost)
			result.add((ddosattack.relogo.ZombieHost)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of zombieHosts on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of zombieHosts on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.ZombieHost")
	public AgentSet<ddosattack.relogo.ZombieHost> zombieHostsOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<ddosattack.relogo.ZombieHost>();
		}

		Set<ddosattack.relogo.ZombieHost> total = new HashSet<ddosattack.relogo.ZombieHost>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(zombieHostsOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(zombieHostsOn(p));
				}
			}
		}
		return new AgentSet<ddosattack.relogo.ZombieHost>(total);
	}

	/**
	 * Queries if object is a zombieHost.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a zombieHost
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.ZombieHost")
	public boolean isZombieHostQ(Object o){
		return (o instanceof ddosattack.relogo.ZombieHost);
	}

	/**
	 * Returns an agentset containing all zombieHosts.
	 * 
	 * @return agentset of all zombieHosts
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.ZombieHost")
	public AgentSet<ddosattack.relogo.ZombieHost> zombieHosts(){
		AgentSet<ddosattack.relogo.ZombieHost> a = new AgentSet<ddosattack.relogo.ZombieHost>();
		for (Object e : this.getMyObserver().getContext().getObjects(ddosattack.relogo.ZombieHost.class)) {
			if (e instanceof ddosattack.relogo.ZombieHost){
				a.add((ddosattack.relogo.ZombieHost)e);
			}
		}
		return a;
	}

	/**
	 * Returns the zombieHost with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.ZombieHost")
	public ddosattack.relogo.ZombieHost zombieHost(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof ddosattack.relogo.ZombieHost)
			return (ddosattack.relogo.ZombieHost) turtle;
		return null;
	}

	/**
	 * Sprouts (makes) a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.UserTurtle")
	public AgentSet<ddosattack.relogo.UserTurtle> sproutUserTurtles(int number, Closure closure) {
		AgentSet<ddosattack.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof ddosattack.relogo.UserTurtle){
				result.add((ddosattack.relogo.UserTurtle)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.UserTurtle")
	public AgentSet<ddosattack.relogo.UserTurtle> sproutUserTurtles(int number) {
		return sproutUserTurtles(number,null);
	}

	/**
	 * Returns an agentset of userTurtles from the patch of the caller.
	 * 
	 * @return agentset of userTurtles from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.UserTurtle")
	public AgentSet<ddosattack.relogo.UserTurtle> userTurtlesHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<ddosattack.relogo.UserTurtle> result = new AgentSet<ddosattack.relogo.UserTurtle>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"userTurtle")){
			if (t instanceof ddosattack.relogo.UserTurtle)
			result.add((ddosattack.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of userTurtles on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of userTurtles at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.UserTurtle")
	public AgentSet<ddosattack.relogo.UserTurtle> userTurtlesAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
		AgentSet<ddosattack.relogo.UserTurtle> result = new AgentSet<ddosattack.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"userTurtle")){
			if (t instanceof ddosattack.relogo.UserTurtle)
			result.add((ddosattack.relogo.UserTurtle)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<ddosattack.relogo.UserTurtle>();
		}
	}

	/**
	 * Returns an agentset of userTurtles on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of userTurtles on patch p
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.UserTurtle")
	public AgentSet<ddosattack.relogo.UserTurtle> userTurtlesOn(Patch p){
		AgentSet<ddosattack.relogo.UserTurtle> result = new AgentSet<ddosattack.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"userTurtle")){
			if (t instanceof ddosattack.relogo.UserTurtle)
			result.add((ddosattack.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of userTurtles on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.UserTurtle")
	public AgentSet<ddosattack.relogo.UserTurtle> userTurtlesOn(Turtle t){
		AgentSet<ddosattack.relogo.UserTurtle> result = new AgentSet<ddosattack.relogo.UserTurtle>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"userTurtle")){
			if (tt instanceof ddosattack.relogo.UserTurtle)
			result.add((ddosattack.relogo.UserTurtle)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of userTurtles on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.UserTurtle")
	public AgentSet<ddosattack.relogo.UserTurtle> userTurtlesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<ddosattack.relogo.UserTurtle>();
		}

		Set<ddosattack.relogo.UserTurtle> total = new HashSet<ddosattack.relogo.UserTurtle>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(userTurtlesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(userTurtlesOn(p));
				}
			}
		}
		return new AgentSet<ddosattack.relogo.UserTurtle>(total);
	}

	/**
	 * Queries if object is a userTurtle.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userTurtle
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.UserTurtle")
	public boolean isUserTurtleQ(Object o){
		return (o instanceof ddosattack.relogo.UserTurtle);
	}

	/**
	 * Returns an agentset containing all userTurtles.
	 * 
	 * @return agentset of all userTurtles
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.UserTurtle")
	public AgentSet<ddosattack.relogo.UserTurtle> userTurtles(){
		AgentSet<ddosattack.relogo.UserTurtle> a = new AgentSet<ddosattack.relogo.UserTurtle>();
		for (Object e : this.getMyObserver().getContext().getObjects(ddosattack.relogo.UserTurtle.class)) {
			if (e instanceof ddosattack.relogo.UserTurtle){
				a.add((ddosattack.relogo.UserTurtle)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userTurtle with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.UserTurtle")
	public ddosattack.relogo.UserTurtle userTurtle(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof ddosattack.relogo.UserTurtle)
			return (ddosattack.relogo.UserTurtle) turtle;
		return null;
	}

	/**
	 * Sprouts (makes) a number of new servers and then executes a set of commands on the
	 * created servers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created servers
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Server")
	public AgentSet<ddosattack.relogo.Server> sproutServers(int number, Closure closure) {
		AgentSet<ddosattack.relogo.Server> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"Server");
		for (Turtle t : createResult){
			if (t instanceof ddosattack.relogo.Server){
				result.add((ddosattack.relogo.Server)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new servers and then executes a set of commands on the
	 * created servers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created servers
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Server")
	public AgentSet<ddosattack.relogo.Server> sproutServers(int number) {
		return sproutServers(number,null);
	}

	/**
	 * Returns an agentset of servers from the patch of the caller.
	 * 
	 * @return agentset of servers from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Server")
	public AgentSet<ddosattack.relogo.Server> serversHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<ddosattack.relogo.Server> result = new AgentSet<ddosattack.relogo.Server>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"server")){
			if (t instanceof ddosattack.relogo.Server)
			result.add((ddosattack.relogo.Server)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of servers on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of servers at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Server")
	public AgentSet<ddosattack.relogo.Server> serversAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
		AgentSet<ddosattack.relogo.Server> result = new AgentSet<ddosattack.relogo.Server>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"server")){
			if (t instanceof ddosattack.relogo.Server)
			result.add((ddosattack.relogo.Server)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<ddosattack.relogo.Server>();
		}
	}

	/**
	 * Returns an agentset of servers on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of servers on patch p
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Server")
	public AgentSet<ddosattack.relogo.Server> serversOn(Patch p){
		AgentSet<ddosattack.relogo.Server> result = new AgentSet<ddosattack.relogo.Server>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"server")){
			if (t instanceof ddosattack.relogo.Server)
			result.add((ddosattack.relogo.Server)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of servers on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of servers on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Server")
	public AgentSet<ddosattack.relogo.Server> serversOn(Turtle t){
		AgentSet<ddosattack.relogo.Server> result = new AgentSet<ddosattack.relogo.Server>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"server")){
			if (tt instanceof ddosattack.relogo.Server)
			result.add((ddosattack.relogo.Server)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of servers on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of servers on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Server")
	public AgentSet<ddosattack.relogo.Server> serversOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<ddosattack.relogo.Server>();
		}

		Set<ddosattack.relogo.Server> total = new HashSet<ddosattack.relogo.Server>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(serversOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(serversOn(p));
				}
			}
		}
		return new AgentSet<ddosattack.relogo.Server>(total);
	}

	/**
	 * Queries if object is a server.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a server
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Server")
	public boolean isServerQ(Object o){
		return (o instanceof ddosattack.relogo.Server);
	}

	/**
	 * Returns an agentset containing all servers.
	 * 
	 * @return agentset of all servers
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Server")
	public AgentSet<ddosattack.relogo.Server> servers(){
		AgentSet<ddosattack.relogo.Server> a = new AgentSet<ddosattack.relogo.Server>();
		for (Object e : this.getMyObserver().getContext().getObjects(ddosattack.relogo.Server.class)) {
			if (e instanceof ddosattack.relogo.Server){
				a.add((ddosattack.relogo.Server)e);
			}
		}
		return a;
	}

	/**
	 * Returns the server with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Server")
	public ddosattack.relogo.Server server(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof ddosattack.relogo.Server)
			return (ddosattack.relogo.Server) turtle;
		return null;
	}

	/**
	 * Sprouts (makes) a number of new hosts and then executes a set of commands on the
	 * created hosts.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created hosts
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Host")
	public AgentSet<ddosattack.relogo.Host> sproutHosts(int number, Closure closure) {
		AgentSet<ddosattack.relogo.Host> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"Host");
		for (Turtle t : createResult){
			if (t instanceof ddosattack.relogo.Host){
				result.add((ddosattack.relogo.Host)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new hosts and then executes a set of commands on the
	 * created hosts.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created hosts
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Host")
	public AgentSet<ddosattack.relogo.Host> sproutHosts(int number) {
		return sproutHosts(number,null);
	}

	/**
	 * Returns an agentset of hosts from the patch of the caller.
	 * 
	 * @return agentset of hosts from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Host")
	public AgentSet<ddosattack.relogo.Host> hostsHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<ddosattack.relogo.Host> result = new AgentSet<ddosattack.relogo.Host>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"host")){
			if (t instanceof ddosattack.relogo.Host)
			result.add((ddosattack.relogo.Host)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of hosts on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of hosts at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Host")
	public AgentSet<ddosattack.relogo.Host> hostsAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
		AgentSet<ddosattack.relogo.Host> result = new AgentSet<ddosattack.relogo.Host>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"host")){
			if (t instanceof ddosattack.relogo.Host)
			result.add((ddosattack.relogo.Host)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<ddosattack.relogo.Host>();
		}
	}

	/**
	 * Returns an agentset of hosts on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of hosts on patch p
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Host")
	public AgentSet<ddosattack.relogo.Host> hostsOn(Patch p){
		AgentSet<ddosattack.relogo.Host> result = new AgentSet<ddosattack.relogo.Host>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"host")){
			if (t instanceof ddosattack.relogo.Host)
			result.add((ddosattack.relogo.Host)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of hosts on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of hosts on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Host")
	public AgentSet<ddosattack.relogo.Host> hostsOn(Turtle t){
		AgentSet<ddosattack.relogo.Host> result = new AgentSet<ddosattack.relogo.Host>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"host")){
			if (tt instanceof ddosattack.relogo.Host)
			result.add((ddosattack.relogo.Host)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of hosts on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of hosts on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Host")
	public AgentSet<ddosattack.relogo.Host> hostsOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<ddosattack.relogo.Host>();
		}

		Set<ddosattack.relogo.Host> total = new HashSet<ddosattack.relogo.Host>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(hostsOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(hostsOn(p));
				}
			}
		}
		return new AgentSet<ddosattack.relogo.Host>(total);
	}

	/**
	 * Queries if object is a host.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a host
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Host")
	public boolean isHostQ(Object o){
		return (o instanceof ddosattack.relogo.Host);
	}

	/**
	 * Returns an agentset containing all hosts.
	 * 
	 * @return agentset of all hosts
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Host")
	public AgentSet<ddosattack.relogo.Host> hosts(){
		AgentSet<ddosattack.relogo.Host> a = new AgentSet<ddosattack.relogo.Host>();
		for (Object e : this.getMyObserver().getContext().getObjects(ddosattack.relogo.Host.class)) {
			if (e instanceof ddosattack.relogo.Host){
				a.add((ddosattack.relogo.Host)e);
			}
		}
		return a;
	}

	/**
	 * Returns the host with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.Host")
	public ddosattack.relogo.Host host(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof ddosattack.relogo.Host)
			return (ddosattack.relogo.Host) turtle;
		return null;
	}

	/**
	 * Queries if object is a userLink.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userLink
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.UserLink")
	public boolean isUserLinkQ(Object o){
		return (o instanceof ddosattack.relogo.UserLink);
	}

	/**
	 * Returns an agentset containing all userLinks.
	 * 
	 * @return agentset of all userLinks
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.UserLink")
	public AgentSet<ddosattack.relogo.UserLink> userLinks(){
		AgentSet<ddosattack.relogo.UserLink> a = new AgentSet<ddosattack.relogo.UserLink>();
		for (Object e : this.getMyObserver().getContext().getObjects(ddosattack.relogo.UserLink.class)) {
			if (e instanceof ddosattack.relogo.UserLink){
				a.add((ddosattack.relogo.UserLink)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.UserLink")
	public ddosattack.relogo.UserLink userLink(Number oneEnd, Number otherEnd) {
		return (ddosattack.relogo.UserLink)(this.getMyObserver().getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.UserLink")
	public ddosattack.relogo.UserLink userLink(Turtle oneEnd, Turtle otherEnd) {
		return userLink(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Queries if object is a packageFlow.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a packageFlow
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.PackageFlow")
	public boolean isPackageFlowQ(Object o){
		return (o instanceof ddosattack.relogo.PackageFlow);
	}

	/**
	 * Returns an agentset containing all packageFlows.
	 * 
	 * @return agentset of all packageFlows
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.PackageFlow")
	public AgentSet<ddosattack.relogo.PackageFlow> packageFlows(){
		AgentSet<ddosattack.relogo.PackageFlow> a = new AgentSet<ddosattack.relogo.PackageFlow>();
		for (Object e : this.getMyObserver().getContext().getObjects(ddosattack.relogo.PackageFlow.class)) {
			if (e instanceof ddosattack.relogo.PackageFlow){
				a.add((ddosattack.relogo.PackageFlow)e);
			}
		}
		return a;
	}

	/**
	 * Returns the packageFlow between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return packageFlow between two turtles
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.PackageFlow")
	public ddosattack.relogo.PackageFlow packageFlow(Number oneEnd, Number otherEnd) {
		return (ddosattack.relogo.PackageFlow)(this.getMyObserver().getNetwork("PackageFlow").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the packageFlow between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return packageFlow between two turtles
	 */
	@ReLogoBuilderGeneratedFor("ddosattack.relogo.PackageFlow")
	public ddosattack.relogo.PackageFlow packageFlow(Turtle oneEnd, Turtle otherEnd) {
		return packageFlow(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Returns the value of the global variable numHosts.
	 *
	 * @return the value of the global variable numHosts
	 */
	@ReLogoBuilderGeneratedFor("global: numHosts")
	public Object getNumHosts(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numHosts");
	}

	/**
	 * Sets the value of the global variable numHosts.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numHosts")
	public void setNumHosts(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numHosts",value);
	}

	/**
	 * Returns the value of the global variable numZombieHosts.
	 *
	 * @return the value of the global variable numZombieHosts
	 */
	@ReLogoBuilderGeneratedFor("global: numZombieHosts")
	public Object getNumZombieHosts(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numZombieHosts");
	}

	/**
	 * Sets the value of the global variable numZombieHosts.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numZombieHosts")
	public void setNumZombieHosts(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numZombieHosts",value);
	}


}