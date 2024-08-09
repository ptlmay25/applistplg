// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "Applist",
    platforms: [.iOS(.v13)],
    products: [
        .library(
            name: "Applist",
            targets: ["AppListPluginPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", branch: "main")
    ],
    targets: [
        .target(
            name: "AppListPluginPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/AppListPluginPlugin"),
        .testTarget(
            name: "AppListPluginPluginTests",
            dependencies: ["AppListPluginPlugin"],
            path: "ios/Tests/AppListPluginPluginTests")
    ]
)