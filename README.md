<p>
<center>
<a href="https://modrinth.com/mod/rocket-utils">
<img alt="modrinth" height="56" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/modrinth_vector.svg">
</a>
<a href="https://www.curseforge.com/minecraft/mc-mods/rocket-utils">
<img alt="curseforge" height="56" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/curseforge_vector.svg">
</a>
</center>
</p>
<p>
<center>
<a href="https://modrinth.com/mod/fabric-api">
<img alt="fabric-api" height="56" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/requires/fabric-api_vector.svg">
</a>
<a href="https://modrinth.com/mod/yacl">
<img alt="fabric-api" height="56" src="https://raw.githubusercontent.com/Danrus1100/durability_visibility_options/refs/heads/dev/assets/YACL.svg">
</a>
</center>
</p>
<p><center><a href="https://discord.gg/sBpHZUBebQ"><img alt="discord-singular" height="40" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/compact/social/discord-singular_vector.svg">
</a></center</p>


# Rocket Utlis

This mod turns off unnecessary (in my opinion) interaction with rockets:

1. Sneak-only interaction
![demo1](assets/demo1.gif)
2. Using through grass and other non-colide blocks
![demo2](assets/demo2.gif)

# Lithium compatibility

Some things don't work by default if you use Lithium. To fix this, open the `.minecraft/config/lithium.properties` file and add to it:

```properties
mixin.world.raycast=false
```