# Development-Party-And-Friends-For-Spigot

This plugin can be used as a maven dependency for plugins implementing stuff for the Spigot version of Party And
Friends. You basically should only use this as a dependency if you want to manually convert a Player into a Bukkit
Player into an OnlinePAFPlayer. All other APIs are the same as in
the [Bungeecord version](https://github.com/Simonsator/BungeecordPartyAndFriends) and therefor that one should be used
as a dependency, as this is only a very stripped down version of Party And Friends for maven dependency purposes.

## How do I get a Party and convert a Bukkit Player into a PAFPlayer

```java
public void doSomething(Player pPlayer) {
		OnlinePAFPlayer player = PAFPlayerManager.getInstance().getPlayer(pPlayer);
		PlayerParty party = PartyManager.getInstance().getParty(player);
		}
```

## Maven dependency

```
	<repositories>
		<repository>
			<id>simonsators Repo</id>
			<url>https://simonsator.de/repo</url>
		</repository>
	</repositories>
	<dependencies>
		<dependency>
			<groupId>de.simonsator</groupId>
			<artifactId>DevelopmentPAFSpigot</artifactId>
			<version>1.0.67</version>
			<scope>provided</scope>
		</dependency>
	</dependencies>
```
