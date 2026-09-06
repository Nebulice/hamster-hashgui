# Changelog


## Commit `2298c8d` - 2026-09-06 15:12:45 (+0200)
**Sujet Karma :** `ci(hashgui): passer targetJavaVersion en version 21`  
**Auteur :** blegourr <blegourr@gmail.com>

#### Fichiers Ajoutés :
- ➕ [CHANGELOG.md](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/CHANGELOG.md) : Ajout d'une nouvelle fonctionnalité / helper.

#### Fichiers Modifiés :
- ✏️ [uild.gradle](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/uild.gradle) : Refactorisation et mise à jour selon les normes du projet.

---

## Commit `68e1707` - 2026-09-06 15:12:45 (+0200)
**Sujet Karma :** `fix(ci): refonte workflow avec extraction des librairies depuis les images docker ghcr`  
**Auteur :** blegourr <blegourr@gmail.com>

#### Fichiers Modifiés :
- ✏️ [build-plugin.yml](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/.github/workflows/build-plugin.yml) : Refonte du workflow pour extraire les librairies .jar depuis les images Docker GHCR des dependances

---
## Commit `cbf164e` - 2026-09-06 14:48:45 (+0200)
**Sujet Karma :** `fix(ci): mise a jour du wrapper gradle 8.12.1 et java home 21 pour execution daemon`  
**Auteur :** blegourr <blegourr@gmail.com>

#### Fichiers Modifiés :
- ✏️ [build-plugin.yml](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/.github/workflows/build-plugin.yml) : Mise a jour du workflow avec JAVA_HOME_21_X64 pour launcher Gradle daemon
- ✏️ [build.gradle](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/build.gradle) : Refactorisation et mise à jour selon les normes du projet.
- ✏️ [gradle-wrapper.properties](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/gradle/wrapper/gradle-wrapper.properties) : Passage sur Gradle 8.12.1

---
## Commit `d179c48` - 2026-09-06 14:40:31 (+0200)
**Sujet Karma :** `fix(ci): passer a gradle 9.2.1 et deleguer au reusable-plugin-ci`  
**Auteur :** blegourr <blegourr@gmail.com>

#### Fichiers Modifiés :
- ✏️ [build-plugin.yml](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/github/workflows/build-plugin.yml) : Mise a jour du workflow pour deleguer a reusable-plugin-ci@dev
- ✏️ [gradle-wrapper.properties](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/gradle/wrapper/gradle-wrapper.properties) : Mise a jour de Gradle wrapper vers 9.2.1

---
## Commit `af8eabb` - 2026-09-06 14:12:07 (+0200)
**Sujet Karma :** `ci(workflow): convert to self-contained standalone inline workflow`  
**Auteur :** blegourr <blegourr@gmail.com>

#### Fichiers Modifiés :
- ✏️ [build-plugin.yml](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/github/workflows/build-plugin.yml) : Mise a jour du workflow en version autonome et inline avec dependances topologiques

---
## Commit `dfc5248` - 2026-09-06 14:05:57 (+0200)
**Sujet Karma :** `ci(workflow): reference reusable workflow on dev branch`  
**Auteur :** blegourr <blegourr@gmail.com>

#### Fichiers Modifiés :
- ✏️ [build-plugin.yml](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/github/workflows/build-plugin.yml) : Mise a jour du workflow pour cibler reusable-plugin-ci.yml sur la branche dev

---
## Commit `f7c390f` - 2026-09-06 13:47:08 (+0200)
**Sujet Karma :** `ci(workflow): update build-plugin workflow with topological dependencies and cascade triggers`  
**Auteur :** blegourr <blegourr@gmail.com>

#### Fichiers Modifiés :
- ✏️ [build-plugin.yml](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/github/workflows/build-plugin.yml) : Mise a jour du workflow CI reusable avec dependances topologiques et declenchements en cascade

---
## Commit `58d46d5` - 2026-09-05 18:31:27 (+0200)
**Sujet Karma :** `fix(ci): ajout de Hamster-Economie et Hamster-Whitelist aux dependances de build`  
**Auteur :** blegourr <blegourr@gmail.com>

#### Fichiers Modifiés :
- ✏️ [build-plugin.yml](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/github/workflows/build-plugin.yml) : Refactorisation et mise à jour selon les normes du projet.

---
## Commit `801901e` - 2026-09-05 18:09:18 (+0200)
**Sujet Karma :** `fix(ci): correction de la syntaxe heredoc EOF du workflow Dockerfile`  
**Auteur :** blegourr <blegourr@gmail.com>

#### Fichiers Modifiés :
- ✏️ [build-plugin.yml](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/github/workflows/build-plugin.yml) : Refactorisation et mise à jour selon les normes du projet.

---

## Commit `1ab24da` - 2026-09-05 17:27:55 (+0200)
**Sujet Karma :** `ci(hamster-hashgui): compatibilite Paper 26.2 et JDK 25 toolchain`  
**Auteur :** blegourr <blegourr@gmail.com>

#### Fichiers Modifiés :
- ✏️ [build-plugin.yml](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/github/workflows/build-plugin.yml) : Refactorisation et mise à jour selon les normes du projet.
- ✏️ [build.gradle](file:///home/blegourr/Documents/dev/nebulice/dev/plugins/hamster-hashgui/build.gradle) : Refactorisation et mise à jour selon les normes du projet.

---
