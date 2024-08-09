# applist

applist

## Install

```bash
npm install applist
npx cap sync
```

## API

<docgen-index>

* [`getInstalledApps()`](#getinstalledapps)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### getInstalledApps()

```typescript
getInstalledApps() => Promise<{ apps: AppInfo[]; }>
```

**Returns:** <code>Promise&lt;{ apps: AppInfo[]; }&gt;</code>

--------------------


### Interfaces


#### AppInfo

| Prop              | Type                |
| ----------------- | ------------------- |
| **`packageName`** | <code>string</code> |
| **`appName`**     | <code>string</code> |
| **`versionName`** | <code>string</code> |
| **`versionCode`** | <code>number</code> |

</docgen-api>
