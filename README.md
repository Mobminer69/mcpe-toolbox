# MCPE Toolbox

A comprehensive Android toolbox application for Minecraft Pocket Edition featuring combat settings, movement tweaks, world management, item giving, and NBT editing.

## Features

### 🎯 Combat
- Damage indicators
- Combat statistics
- Hit detection helpers
- Attack speed optimization

### 🏃 Movement
- Speed modifiers
- Jump enhancements
- Flight controls
- Velocity adjusters

### 🌍 World Management
- World browser and selector
- World backup and restore
- World deletion
- World properties editor

### 🎁 Item Management
- Give items command generator
- Item search and filter
- Custom item properties
- Inventory viewer

### 📝 NBT Editor
- Edit entity NBT data
- Edit block NBT data
- Syntax highlighting
- Real-time validation

## Tech Stack

- **Language**: Kotlin
- **Architecture**: MVVM with Clean Architecture
- **UI Framework**: Jetpack Compose
- **Database**: Room Database
- **Networking**: Retrofit + OkHttp
- **JSON**: Moshi/Gson

## Getting Started

### Prerequisites
- Android Studio Flamingo or later
- JDK 11+
- Android SDK API 24+

### Installation

1. Clone the repository
```bash
git clone https://github.com/67cixseven-gif/mcpe-toolbox.git
cd mcpe-toolbox
```

2. Open in Android Studio

3. Sync Gradle files

4. Build and run on emulator or device

## Project Structure

```
mcpe-toolbox/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/mcpe/toolbox/
│   │   │   │   ├── ui/
│   │   │   │   ├── viewmodel/
│   │   │   │   ├── repository/
│   │   │   │   ├── data/
│   │   │   │   └── utils/
│   │   │   └── res/
│   │   └── test/
│   └── build.gradle.kts
├── gradle/
├── build.gradle.kts
└── settings.gradle.kts
```

## License

MIT License

## Disclaimer

This is a third-party tool. Not affiliated with Microsoft or Minecraft.