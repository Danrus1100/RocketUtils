![icon](https://cdn.modrinth.com/data/mxxedOhh/cb6d65c6289ffcbfa32105219e326254bd51e371.png)
---
|| "Where are f*ck all my rockets" - Danrus110, before creating this mod ||

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