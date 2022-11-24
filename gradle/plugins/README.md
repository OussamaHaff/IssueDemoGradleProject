# Trainline Platform One build plugins
Convention plugins for the build.

## Why not buildSrc?
Any change in buildSrc invalidates all the caches, which is not ideal, as it causes a lot of rebuilds.
 * For example some versions are hosted in buildSrc,
   which means a library upgrade will trigger full builds for all developers.
 * Another example is when build scripts evolve, the same thing happens.

Most of the time changes to the build don't affect everything all at once, only some minor differences.
For example changing a version or configuration of NewRelic
will not affect the Kotlin compilation of a feature module, but it'll affect the application assembly only.
So all the feature modules, compilations, tests, etc. can be coming from cache.

Note: this behavior is exactly the same as having all the build code in build.gradle(.kts) files,
changes to those don't invalidate everything either.

## Modules
We have specific types of modules in the application.
Each module type has their own set of rules and build logic.
See [`build.gradle.kts` > `gradlePlugin.plugins`](build.gradle.kts) for more details.
